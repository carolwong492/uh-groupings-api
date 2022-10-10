package edu.hawaii.its.api.groupings;

import edu.hawaii.its.api.wrapper.AddMembersResults;
import edu.hawaii.its.api.wrapper.RemoveMembersResults;

public class GroupingsMoveMembersResult extends GroupingsMembersResults {
    private final GroupingsAddResults addResults;
    private final GroupingsRemoveResults removeResults;

    public GroupingsMoveMembersResult(AddMembersResults addMembersResults, RemoveMembersResults removeMembersResults) {
        addResults = new GroupingsAddResults(addMembersResults);
        removeResults = new GroupingsRemoveResults(removeMembersResults);
        this.resultCode = addResults.resultCode;
    }

    @Override public String getResultCode() {
        return resultCode;
    }

    public GroupingsAddResults getAddResults() {
        return addResults;
    }

    public GroupingsRemoveResults getRemoveResults() {
        return removeResults;
    }
}