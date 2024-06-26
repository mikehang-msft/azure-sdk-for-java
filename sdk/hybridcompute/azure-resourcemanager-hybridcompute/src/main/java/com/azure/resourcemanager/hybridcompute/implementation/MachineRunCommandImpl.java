// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybridcompute.fluent.models.MachineRunCommandInner;
import com.azure.resourcemanager.hybridcompute.models.MachineRunCommand;
import com.azure.resourcemanager.hybridcompute.models.MachineRunCommandInstanceView;
import com.azure.resourcemanager.hybridcompute.models.MachineRunCommandScriptSource;
import com.azure.resourcemanager.hybridcompute.models.RunCommandInputParameter;
import com.azure.resourcemanager.hybridcompute.models.RunCommandManagedIdentity;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class MachineRunCommandImpl
    implements MachineRunCommand, MachineRunCommand.Definition, MachineRunCommand.Update {
    private MachineRunCommandInner innerObject;

    private final com.azure.resourcemanager.hybridcompute.HybridComputeManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public MachineRunCommandScriptSource source() {
        return this.innerModel().source();
    }

    public List<RunCommandInputParameter> parameters() {
        List<RunCommandInputParameter> inner = this.innerModel().parameters();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<RunCommandInputParameter> protectedParameters() {
        List<RunCommandInputParameter> inner = this.innerModel().protectedParameters();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean asyncExecution() {
        return this.innerModel().asyncExecution();
    }

    public String runAsUser() {
        return this.innerModel().runAsUser();
    }

    public String runAsPassword() {
        return this.innerModel().runAsPassword();
    }

    public Integer timeoutInSeconds() {
        return this.innerModel().timeoutInSeconds();
    }

    public String outputBlobUri() {
        return this.innerModel().outputBlobUri();
    }

    public String errorBlobUri() {
        return this.innerModel().errorBlobUri();
    }

    public RunCommandManagedIdentity outputBlobManagedIdentity() {
        return this.innerModel().outputBlobManagedIdentity();
    }

    public RunCommandManagedIdentity errorBlobManagedIdentity() {
        return this.innerModel().errorBlobManagedIdentity();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public MachineRunCommandInstanceView instanceView() {
        return this.innerModel().instanceView();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public MachineRunCommandInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybridcompute.HybridComputeManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String machineName;

    private String runCommandName;

    public MachineRunCommandImpl withExistingMachine(String resourceGroupName, String machineName) {
        this.resourceGroupName = resourceGroupName;
        this.machineName = machineName;
        return this;
    }

    public MachineRunCommand create() {
        this.innerObject = serviceManager.serviceClient()
            .getMachineRunCommands()
            .createOrUpdate(resourceGroupName, machineName, runCommandName, this.innerModel(), Context.NONE);
        return this;
    }

    public MachineRunCommand create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getMachineRunCommands()
            .createOrUpdate(resourceGroupName, machineName, runCommandName, this.innerModel(), context);
        return this;
    }

    MachineRunCommandImpl(String name, com.azure.resourcemanager.hybridcompute.HybridComputeManager serviceManager) {
        this.innerObject = new MachineRunCommandInner();
        this.serviceManager = serviceManager;
        this.runCommandName = name;
    }

    public MachineRunCommandImpl update() {
        return this;
    }

    public MachineRunCommand apply() {
        this.innerObject = serviceManager.serviceClient()
            .getMachineRunCommands()
            .createOrUpdate(resourceGroupName, machineName, runCommandName, this.innerModel(), Context.NONE);
        return this;
    }

    public MachineRunCommand apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getMachineRunCommands()
            .createOrUpdate(resourceGroupName, machineName, runCommandName, this.innerModel(), context);
        return this;
    }

    MachineRunCommandImpl(MachineRunCommandInner innerObject,
        com.azure.resourcemanager.hybridcompute.HybridComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.machineName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "machines");
        this.runCommandName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "runCommands");
    }

    public MachineRunCommand refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getMachineRunCommands()
            .getWithResponse(resourceGroupName, machineName, runCommandName, Context.NONE)
            .getValue();
        return this;
    }

    public MachineRunCommand refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getMachineRunCommands()
            .getWithResponse(resourceGroupName, machineName, runCommandName, context)
            .getValue();
        return this;
    }

    public MachineRunCommandImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public MachineRunCommandImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public MachineRunCommandImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public MachineRunCommandImpl withSource(MachineRunCommandScriptSource source) {
        this.innerModel().withSource(source);
        return this;
    }

    public MachineRunCommandImpl withParameters(List<RunCommandInputParameter> parameters) {
        this.innerModel().withParameters(parameters);
        return this;
    }

    public MachineRunCommandImpl withProtectedParameters(List<RunCommandInputParameter> protectedParameters) {
        this.innerModel().withProtectedParameters(protectedParameters);
        return this;
    }

    public MachineRunCommandImpl withAsyncExecution(Boolean asyncExecution) {
        this.innerModel().withAsyncExecution(asyncExecution);
        return this;
    }

    public MachineRunCommandImpl withRunAsUser(String runAsUser) {
        this.innerModel().withRunAsUser(runAsUser);
        return this;
    }

    public MachineRunCommandImpl withRunAsPassword(String runAsPassword) {
        this.innerModel().withRunAsPassword(runAsPassword);
        return this;
    }

    public MachineRunCommandImpl withTimeoutInSeconds(Integer timeoutInSeconds) {
        this.innerModel().withTimeoutInSeconds(timeoutInSeconds);
        return this;
    }

    public MachineRunCommandImpl withOutputBlobUri(String outputBlobUri) {
        this.innerModel().withOutputBlobUri(outputBlobUri);
        return this;
    }

    public MachineRunCommandImpl withErrorBlobUri(String errorBlobUri) {
        this.innerModel().withErrorBlobUri(errorBlobUri);
        return this;
    }

    public MachineRunCommandImpl withOutputBlobManagedIdentity(RunCommandManagedIdentity outputBlobManagedIdentity) {
        this.innerModel().withOutputBlobManagedIdentity(outputBlobManagedIdentity);
        return this;
    }

    public MachineRunCommandImpl withErrorBlobManagedIdentity(RunCommandManagedIdentity errorBlobManagedIdentity) {
        this.innerModel().withErrorBlobManagedIdentity(errorBlobManagedIdentity);
        return this;
    }
}
