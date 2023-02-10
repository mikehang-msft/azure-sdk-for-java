// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.BigDataPoolResourceInfoInner;
import com.azure.resourcemanager.synapse.fluent.models.LibraryInfo;
import com.azure.resourcemanager.synapse.models.AutoPauseProperties;
import com.azure.resourcemanager.synapse.models.AutoScaleProperties;
import com.azure.resourcemanager.synapse.models.ConfigurationType;
import com.azure.resourcemanager.synapse.models.DynamicExecutorAllocation;
import com.azure.resourcemanager.synapse.models.LibraryRequirements;
import com.azure.resourcemanager.synapse.models.NodeSize;
import com.azure.resourcemanager.synapse.models.NodeSizeFamily;
import com.azure.resourcemanager.synapse.models.SparkConfigProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BigDataPoolResourceInfoInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BigDataPoolResourceInfoInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"provisioningState\":\"e\",\"autoScale\":{\"minNodeCount\":2052127591,\"enabled\":true,\"maxNodeCount\":619135714},\"creationDate\":\"2021-01-05T00:16:17Z\",\"autoPause\":{\"delayInMinutes\":639795933,\"enabled\":false},\"isComputeIsolationEnabled\":false,\"isAutotuneEnabled\":false,\"sessionLevelPackagesEnabled\":false,\"cacheSize\":364204104,\"dynamicExecutorAllocation\":{\"enabled\":true,\"minExecutors\":1714927386,\"maxExecutors\":1816331305},\"sparkEventsFolder\":\"uqyrxpdl\",\"nodeCount\":1303034345,\"libraryRequirements\":{\"time\":\"2021-06-26T18:12:50Z\",\"content\":\"mjqfrddgamquhio\",\"filename\":\"sjuivfcdisyir\"},\"customLibraries\":[{\"name\":\"czexrxzbujrtrhqv\",\"path\":\"evkh\",\"containerName\":\"lnzonzlrpiqywn\",\"uploadedTimestamp\":\"2021-10-30T09:16:37Z\",\"type\":\"szcofizeht\",\"provisioningStatus\":\"gbjkvreljeamur\",\"creatorId\":\"mlovuanashcxl\"},{\"name\":\"jerbdkelvidizozs\",\"path\":\"ccxjm\",\"containerName\":\"fdgnwncypuuwwlt\",\"uploadedTimestamp\":\"2021-11-20T18:00Z\",\"type\":\"ctzenkeifzzhmkd\",\"provisioningStatus\":\"vflyhbxcu\",\"creatorId\":\"hxgsrboldfor\"},{\"name\":\"wjlvizbfhfov\",\"path\":\"cqpbtuo\",\"containerName\":\"eszabbelawumuas\",\"uploadedTimestamp\":\"2021-02-28T06:26:09Z\",\"type\":\"rrwoycqucwyhahn\",\"provisioningStatus\":\"drkywuhps\",\"creatorId\":\"uurutlwexxwlalni\"},{\"name\":\"zsrzpgepq\",\"path\":\"bb\",\"containerName\":\"pgdakchzyvli\",\"uploadedTimestamp\":\"2021-05-06T06:22:36Z\",\"type\":\"kcxk\",\"provisioningStatus\":\"bn\",\"creatorId\":\"ysux\"}],\"sparkConfigProperties\":{\"time\":\"2021-12-01T11:30:12Z\",\"content\":\"tvlwijpsttexoq\",\"filename\":\"wcyyufmhruncu\",\"configurationType\":\"Artifact\"},\"sparkVersion\":\"pkcdqzhlct\",\"defaultSparkLogFolder\":\"unqndyfpchrqb\",\"nodeSize\":\"Large\",\"nodeSizeFamily\":\"HardwareAcceleratedFPGA\",\"lastSucceededTimestamp\":\"2021-11-25T18:15:14Z\"},\"location\":\"gydcw\",\"tags\":{\"aubrjtloq\":\"jumvqqolihrraio\",\"rzpasccbiuimzdly\":\"fuojrngif\"},\"id\":\"dfqwmkyoq\",\"name\":\"fdvruz\",\"type\":\"lzo\"}")
                .toObject(BigDataPoolResourceInfoInner.class);
        Assertions.assertEquals("gydcw", model.location());
        Assertions.assertEquals("jumvqqolihrraio", model.tags().get("aubrjtloq"));
        Assertions.assertEquals("e", model.provisioningState());
        Assertions.assertEquals(2052127591, model.autoScale().minNodeCount());
        Assertions.assertEquals(true, model.autoScale().enabled());
        Assertions.assertEquals(619135714, model.autoScale().maxNodeCount());
        Assertions.assertEquals(639795933, model.autoPause().delayInMinutes());
        Assertions.assertEquals(false, model.autoPause().enabled());
        Assertions.assertEquals(false, model.isComputeIsolationEnabled());
        Assertions.assertEquals(false, model.isAutotuneEnabled());
        Assertions.assertEquals(false, model.sessionLevelPackagesEnabled());
        Assertions.assertEquals(true, model.dynamicExecutorAllocation().enabled());
        Assertions.assertEquals(1714927386, model.dynamicExecutorAllocation().minExecutors());
        Assertions.assertEquals(1816331305, model.dynamicExecutorAllocation().maxExecutors());
        Assertions.assertEquals("uqyrxpdl", model.sparkEventsFolder());
        Assertions.assertEquals(1303034345, model.nodeCount());
        Assertions.assertEquals("mjqfrddgamquhio", model.libraryRequirements().content());
        Assertions.assertEquals("sjuivfcdisyir", model.libraryRequirements().filename());
        Assertions.assertEquals("czexrxzbujrtrhqv", model.customLibraries().get(0).name());
        Assertions.assertEquals("evkh", model.customLibraries().get(0).path());
        Assertions.assertEquals("lnzonzlrpiqywn", model.customLibraries().get(0).containerName());
        Assertions.assertEquals("szcofizeht", model.customLibraries().get(0).type());
        Assertions.assertEquals("tvlwijpsttexoq", model.sparkConfigProperties().content());
        Assertions.assertEquals("wcyyufmhruncu", model.sparkConfigProperties().filename());
        Assertions.assertEquals(ConfigurationType.ARTIFACT, model.sparkConfigProperties().configurationType());
        Assertions.assertEquals("pkcdqzhlct", model.sparkVersion());
        Assertions.assertEquals("unqndyfpchrqb", model.defaultSparkLogFolder());
        Assertions.assertEquals(NodeSize.LARGE, model.nodeSize());
        Assertions.assertEquals(NodeSizeFamily.HARDWARE_ACCELERATED_FPGA, model.nodeSizeFamily());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BigDataPoolResourceInfoInner model =
            new BigDataPoolResourceInfoInner()
                .withLocation("gydcw")
                .withTags(mapOf("aubrjtloq", "jumvqqolihrraio", "rzpasccbiuimzdly", "fuojrngif"))
                .withProvisioningState("e")
                .withAutoScale(
                    new AutoScaleProperties()
                        .withMinNodeCount(2052127591)
                        .withEnabled(true)
                        .withMaxNodeCount(619135714))
                .withAutoPause(new AutoPauseProperties().withDelayInMinutes(639795933).withEnabled(false))
                .withIsComputeIsolationEnabled(false)
                .withIsAutotuneEnabled(false)
                .withSessionLevelPackagesEnabled(false)
                .withDynamicExecutorAllocation(
                    new DynamicExecutorAllocation()
                        .withEnabled(true)
                        .withMinExecutors(1714927386)
                        .withMaxExecutors(1816331305))
                .withSparkEventsFolder("uqyrxpdl")
                .withNodeCount(1303034345)
                .withLibraryRequirements(
                    new LibraryRequirements().withContent("mjqfrddgamquhio").withFilename("sjuivfcdisyir"))
                .withCustomLibraries(
                    Arrays
                        .asList(
                            new LibraryInfo()
                                .withName("czexrxzbujrtrhqv")
                                .withPath("evkh")
                                .withContainerName("lnzonzlrpiqywn")
                                .withType("szcofizeht"),
                            new LibraryInfo()
                                .withName("jerbdkelvidizozs")
                                .withPath("ccxjm")
                                .withContainerName("fdgnwncypuuwwlt")
                                .withType("ctzenkeifzzhmkd"),
                            new LibraryInfo()
                                .withName("wjlvizbfhfov")
                                .withPath("cqpbtuo")
                                .withContainerName("eszabbelawumuas")
                                .withType("rrwoycqucwyhahn"),
                            new LibraryInfo()
                                .withName("zsrzpgepq")
                                .withPath("bb")
                                .withContainerName("pgdakchzyvli")
                                .withType("kcxk")))
                .withSparkConfigProperties(
                    new SparkConfigProperties()
                        .withContent("tvlwijpsttexoq")
                        .withFilename("wcyyufmhruncu")
                        .withConfigurationType(ConfigurationType.ARTIFACT))
                .withSparkVersion("pkcdqzhlct")
                .withDefaultSparkLogFolder("unqndyfpchrqb")
                .withNodeSize(NodeSize.LARGE)
                .withNodeSizeFamily(NodeSizeFamily.HARDWARE_ACCELERATED_FPGA);
        model = BinaryData.fromObject(model).toObject(BigDataPoolResourceInfoInner.class);
        Assertions.assertEquals("gydcw", model.location());
        Assertions.assertEquals("jumvqqolihrraio", model.tags().get("aubrjtloq"));
        Assertions.assertEquals("e", model.provisioningState());
        Assertions.assertEquals(2052127591, model.autoScale().minNodeCount());
        Assertions.assertEquals(true, model.autoScale().enabled());
        Assertions.assertEquals(619135714, model.autoScale().maxNodeCount());
        Assertions.assertEquals(639795933, model.autoPause().delayInMinutes());
        Assertions.assertEquals(false, model.autoPause().enabled());
        Assertions.assertEquals(false, model.isComputeIsolationEnabled());
        Assertions.assertEquals(false, model.isAutotuneEnabled());
        Assertions.assertEquals(false, model.sessionLevelPackagesEnabled());
        Assertions.assertEquals(true, model.dynamicExecutorAllocation().enabled());
        Assertions.assertEquals(1714927386, model.dynamicExecutorAllocation().minExecutors());
        Assertions.assertEquals(1816331305, model.dynamicExecutorAllocation().maxExecutors());
        Assertions.assertEquals("uqyrxpdl", model.sparkEventsFolder());
        Assertions.assertEquals(1303034345, model.nodeCount());
        Assertions.assertEquals("mjqfrddgamquhio", model.libraryRequirements().content());
        Assertions.assertEquals("sjuivfcdisyir", model.libraryRequirements().filename());
        Assertions.assertEquals("czexrxzbujrtrhqv", model.customLibraries().get(0).name());
        Assertions.assertEquals("evkh", model.customLibraries().get(0).path());
        Assertions.assertEquals("lnzonzlrpiqywn", model.customLibraries().get(0).containerName());
        Assertions.assertEquals("szcofizeht", model.customLibraries().get(0).type());
        Assertions.assertEquals("tvlwijpsttexoq", model.sparkConfigProperties().content());
        Assertions.assertEquals("wcyyufmhruncu", model.sparkConfigProperties().filename());
        Assertions.assertEquals(ConfigurationType.ARTIFACT, model.sparkConfigProperties().configurationType());
        Assertions.assertEquals("pkcdqzhlct", model.sparkVersion());
        Assertions.assertEquals("unqndyfpchrqb", model.defaultSparkLogFolder());
        Assertions.assertEquals(NodeSize.LARGE, model.nodeSize());
        Assertions.assertEquals(NodeSizeFamily.HARDWARE_ACCELERATED_FPGA, model.nodeSizeFamily());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}