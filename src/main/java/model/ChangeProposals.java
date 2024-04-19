package model;

/**
 * Represents a change proposal within the system, detailing all aspects related to the proposed change including its scope, impact, and current status.
 */
public class ChangeProposals {

    private int id;
    private String title;
    private String description;
    private String reasonForChange;
    private String affectedAreas;
    private String expectedImpact;
    private VerificationStatus status;
    private DocumentMetadata documentMetadata;
    private Users departmentHeadUser;
    private ChangeTypes changeType;

    // Enum for verification statuses
    public enum VerificationStatus {
        PENDING, VERIFIED, FAILED
    }

    public ChangeProposals() {
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getReasonForChange() {
        return reasonForChange;
    }

    public String getAffectedAreas() {
        return affectedAreas;
    }

    public String getExpectedImpact() {
        return expectedImpact;
    }

    public VerificationStatus getStatus() {
        return status;
    }

    public DocumentMetadata getDocumentMetadata() {
        return documentMetadata;
    }

    public Users getDepartmentHeadUser() {
        return departmentHeadUser;
    }

    public ChangeTypes getChangeType() {
        return changeType;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setReasonForChange(String reasonForChange) {
        this.reasonForChange = reasonForChange;
    }

    public void setAffectedAreas(String affectedAreas) {
        this.affectedAreas = affectedAreas;
    }

    public void setExpectedImpact(String expectedImpact) {
        this.expectedImpact = expectedImpact;
    }

    public void setStatus(VerificationStatus status) {
        this.status = status;
    }

    public void setDocumentMetadata(DocumentMetadata documentMetadata) {
        this.documentMetadata = documentMetadata;
    }

    public void setDepartmentHeadUser(Users departmentHeadUser) {
        this.departmentHeadUser = departmentHeadUser;
    }

    public void setChangeType(ChangeTypes changeType) {
        this.changeType = changeType;
    }

    @Override
    public String toString() {
        return "ChangeProposals{" +
               "id=" + id +
               ", title='" + title + '\'' +
               ", description='" + description + '\'' +
               ", reasonForChange='" + reasonForChange + '\'' +
               ", affectedAreas='" + affectedAreas + '\'' +
               ", expectedImpact='" + expectedImpact + '\'' +
               ", status=" + status +
               ", documentMetadata=" + documentMetadata +
               ", departmentHeadUser=" + departmentHeadUser +
               ", changeType=" + changeType +
               '}';
    }
}