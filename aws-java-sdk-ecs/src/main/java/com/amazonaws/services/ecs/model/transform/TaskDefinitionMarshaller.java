/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ecs.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * TaskDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TaskDefinitionMarshaller {

    private static final MarshallingInfo<String> TASKDEFINITIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskDefinitionArn").build();
    private static final MarshallingInfo<List> CONTAINERDEFINITIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("containerDefinitions").build();
    private static final MarshallingInfo<String> FAMILY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("family").build();
    private static final MarshallingInfo<String> TASKROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskRoleArn").build();
    private static final MarshallingInfo<String> NETWORKMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkMode").build();
    private static final MarshallingInfo<Integer> REVISION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("revision").build();
    private static final MarshallingInfo<List> VOLUMES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("volumes").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<List> REQUIRESATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("requiresAttributes").build();
    private static final MarshallingInfo<List> PLACEMENTCONSTRAINTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("placementConstraints").build();

    private static final TaskDefinitionMarshaller instance = new TaskDefinitionMarshaller();

    public static TaskDefinitionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TaskDefinition taskDefinition, ProtocolMarshaller protocolMarshaller) {

        if (taskDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(taskDefinition.getTaskDefinitionArn(), TASKDEFINITIONARN_BINDING);
            protocolMarshaller.marshall(taskDefinition.getContainerDefinitions(), CONTAINERDEFINITIONS_BINDING);
            protocolMarshaller.marshall(taskDefinition.getFamily(), FAMILY_BINDING);
            protocolMarshaller.marshall(taskDefinition.getTaskRoleArn(), TASKROLEARN_BINDING);
            protocolMarshaller.marshall(taskDefinition.getNetworkMode(), NETWORKMODE_BINDING);
            protocolMarshaller.marshall(taskDefinition.getRevision(), REVISION_BINDING);
            protocolMarshaller.marshall(taskDefinition.getVolumes(), VOLUMES_BINDING);
            protocolMarshaller.marshall(taskDefinition.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(taskDefinition.getRequiresAttributes(), REQUIRESATTRIBUTES_BINDING);
            protocolMarshaller.marshall(taskDefinition.getPlacementConstraints(), PLACEMENTCONSTRAINTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}