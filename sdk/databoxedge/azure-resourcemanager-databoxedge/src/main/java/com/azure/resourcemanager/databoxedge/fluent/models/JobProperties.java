// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.databoxedge.models.JobType;
import com.azure.resourcemanager.databoxedge.models.UpdateDownloadProgress;
import com.azure.resourcemanager.databoxedge.models.UpdateInstallProgress;
import com.azure.resourcemanager.databoxedge.models.UpdateOperationStage;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties for the job. */
@Fluent
public final class JobProperties {
    /*
     * The type of the job.
     */
    @JsonProperty(value = "jobType", access = JsonProperty.Access.WRITE_ONLY)
    private JobType jobType;

    /*
     * Current stage of the update operation.
     */
    @JsonProperty(value = "currentStage", access = JsonProperty.Access.WRITE_ONLY)
    private UpdateOperationStage currentStage;

    /*
     * The download progress.
     */
    @JsonProperty(value = "downloadProgress", access = JsonProperty.Access.WRITE_ONLY)
    private UpdateDownloadProgress downloadProgress;

    /*
     * The install progress.
     */
    @JsonProperty(value = "installProgress", access = JsonProperty.Access.WRITE_ONLY)
    private UpdateInstallProgress installProgress;

    /*
     * Total number of errors encountered during the refresh process.
     */
    @JsonProperty(value = "totalRefreshErrors", access = JsonProperty.Access.WRITE_ONLY)
    private Integer totalRefreshErrors;

    /*
     * Local share/remote container relative path to the error manifest file of the refresh.
     */
    @JsonProperty(value = "errorManifestFile", access = JsonProperty.Access.WRITE_ONLY)
    private String errorManifestFile;

    /*
     * ARM ID of the entity that was refreshed.
     */
    @JsonProperty(value = "refreshedEntityId", access = JsonProperty.Access.WRITE_ONLY)
    private String refreshedEntityId;

    /*
     * If only subfolders need to be refreshed, then the subfolder path inside the share or container. (The path is
     * empty if there are no subfolders.)
     */
    @JsonProperty(value = "folder")
    private String folder;

    /** Creates an instance of JobProperties class. */
    public JobProperties() {
    }

    /**
     * Get the jobType property: The type of the job.
     *
     * @return the jobType value.
     */
    public JobType jobType() {
        return this.jobType;
    }

    /**
     * Get the currentStage property: Current stage of the update operation.
     *
     * @return the currentStage value.
     */
    public UpdateOperationStage currentStage() {
        return this.currentStage;
    }

    /**
     * Get the downloadProgress property: The download progress.
     *
     * @return the downloadProgress value.
     */
    public UpdateDownloadProgress downloadProgress() {
        return this.downloadProgress;
    }

    /**
     * Get the installProgress property: The install progress.
     *
     * @return the installProgress value.
     */
    public UpdateInstallProgress installProgress() {
        return this.installProgress;
    }

    /**
     * Get the totalRefreshErrors property: Total number of errors encountered during the refresh process.
     *
     * @return the totalRefreshErrors value.
     */
    public Integer totalRefreshErrors() {
        return this.totalRefreshErrors;
    }

    /**
     * Get the errorManifestFile property: Local share/remote container relative path to the error manifest file of the
     * refresh.
     *
     * @return the errorManifestFile value.
     */
    public String errorManifestFile() {
        return this.errorManifestFile;
    }

    /**
     * Get the refreshedEntityId property: ARM ID of the entity that was refreshed.
     *
     * @return the refreshedEntityId value.
     */
    public String refreshedEntityId() {
        return this.refreshedEntityId;
    }

    /**
     * Get the folder property: If only subfolders need to be refreshed, then the subfolder path inside the share or
     * container. (The path is empty if there are no subfolders.).
     *
     * @return the folder value.
     */
    public String folder() {
        return this.folder;
    }

    /**
     * Set the folder property: If only subfolders need to be refreshed, then the subfolder path inside the share or
     * container. (The path is empty if there are no subfolders.).
     *
     * @param folder the folder value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withFolder(String folder) {
        this.folder = folder;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (downloadProgress() != null) {
            downloadProgress().validate();
        }
        if (installProgress() != null) {
            installProgress().validate();
        }
    }
}