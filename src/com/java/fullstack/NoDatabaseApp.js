var rel_ci_gr;

var no_db_app_list;

var no_db_array = [];

var nodb_active_db_array = [];

var parent = "";

var gparent = "";

var no_db_count = 0;

var nodb_actdb_count = 0;

var no_db_parent_count = 0;

var nodb_active_db_parent_count = 0;

var no_action_app_count = 0;

var nodb_parents_gr;

var nodb_active_parents_gr;

var no_db_removed_cnt = 0;

var nodb_actdb_removed_cnt = 0;

var no_db_app = new GlideRecord('cmdb_ci_db_catalog');

no_db_app.addEncodedQuery("operational_status!=105^operational_status=1^sys_class_name!=cmdb_ci_db_db2_catalog^sys_class_name!=u_mf_cmdb_ci_ims_database^sys_class_name!=u_cmdb_ci_db_model204_catalog^name=No Database Associated");

no_db_app.query();

while (no_db_app.next()) {

    no_db_app_list = no_db_app.u_supported_applications.toString().trim();

}

var supp_app_array = no_db_app_list.split(',');

gs.log("Total Apps: " + supp_app_array.length);

for (var i = 0; i < supp_app_array.length; i++) {

    gparent = supp_app_array[i].toString().trim();

    rel_ci_gr = new GlideRecord('cmdb_rel_ci');
    rel_ci_gr.addQuery('type', "5f985e0ec0a8010e00a9714f2a172815"); //Hosted on::Hosts
    rel_ci_gr.addQuery('parent.sys_class_name', "cmdb_ci_service_discovered"); //Application Service
    rel_ci_gr.addQuery('parent', gparent); //Parent App

    rel_ci_gr.query();

    while (rel_ci_gr.next()) {

        if (rel_ci_gr.child.toString() == "e13f7d3edbd76094b5e3c45813961947") {
            // No Database Count
            no_db_count = no_db_count + 1;
        } else {
            // Active database Count
            nodb_actdb_count = nodb_actdb_count + 1;
        }

    }

    if (no_db_count > 1 && nodb_actdb_count == 0) {

        no_db_array.push(rel_ci_gr.parent);
        no_db_parent_count = no_db_parent_count + 1;

    } else if (no_db_count > 0 && nodb_actdb_count > 0) {

        nodb_active_db_array.push(rel_ci_gr.parent);
        nodb_active_db_parent_count = nodb_active_db_parent_count + 1;

    } else {
        no_action_app_count = no_action_app_count + 1;
    }

    no_db_count = 0;

    nodb_actdb_count = 0;

}

gs.log("no_db_parent_count : " + no_db_parent_count);
gs.log("nodb_active_db_parent_count : " + nodb_active_db_parent_count);
gs.log("no_action_app_count : " + no_action_app_count);

//Remove duplicates from no db parents
for (var j = 0; j < no_db_array.length; j++) {

    nodb_parents_gr = new GlideRecord('cmdb_rel_ci');
    nodb_parents_gr.addQuery('type', "5f985e0ec0a8010e00a9714f2a172815"); //Hosted on::Hosts
    nodb_parents_gr.addQuery('parent.sys_class_name', "cmdb_ci_service_discovered"); //Application Service
    nodb_parents_gr.addQuery('parent', no_db_array[j]); //Parent App
    nodb_parents_gr.addQuery('child', "e13f7d3edbd76094b5e3c45813961947"); //Child App
    nodb_parents_gr.orderByDesc('sys_created_on');
    nodb_parents_gr.query();

    nodb_parents_gr.next();

    while (nodb_parents_gr.next()) {

        no_db_removed_cnt = no_db_removed_cnt + 1;
        //nodb_parents_gr.setWorkflow(false);
        nodb_parents_gr.deleteMultiple();

    }
    gs.log("Removed Records from  " + no_db_array[j] + " : " + no_db_removed_cnt);
    no_db_removed_cnt = 0;
}


// Remove all no db parents
for (var k = 0; k < nodb_active_db_array.length; k++) {

    nodb_active_parents_gr = new GlideRecord('cmdb_rel_ci');
    nodb_active_parents_gr.addQuery('type', "5f985e0ec0a8010e00a9714f2a172815"); //Hosted on::Hosts
    nodb_active_parents_gr.addQuery('parent.sys_class_name', "cmdb_ci_service_discovered"); //Application Service
    nodb_active_parents_gr.addQuery('parent', nodb_active_db_array[k]); //Parent App
    nodb_active_parents_gr.addQuery('child', "e13f7d3edbd76094b5e3c45813961947"); //Child App
    nodb_active_parents_gr.query();

    nodb_actdb_removed_cnt = nodb_active_parents_gr.getRowCount();
    //nodb_active_parents_gr.setWorkflow(false);
    nodb_active_parents_gr.deleteMultiple();

    gs.log("Removed Records from  " + nodb_active_db_array[k] + " : " + nodb_actdb_removed_cnt);

}

gs.log("Process Completed Successfully!!!");