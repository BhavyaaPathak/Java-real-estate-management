/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Organization.Organization;

/**
 *
 * @author bhavyapathak
 */
public class TenantWorkRequest extends WorkRequest {
    
    private Organization.Type issue;

    public Organization.Type getIssue() {
        return issue;
    }

    public void setIssue(Organization.Type issue) {
        this.issue = issue;
    }

    @Override
    public String toString() {
        return this.issue.toString();
    }

    
    
}
