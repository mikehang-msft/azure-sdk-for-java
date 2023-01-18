// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mixedreality.fluent.models.SpatialAnchorsAccountInner;
import com.azure.resourcemanager.mixedreality.models.Identity;
import com.azure.resourcemanager.mixedreality.models.ResourceIdentityType;
import com.azure.resourcemanager.mixedreality.models.Sku;
import com.azure.resourcemanager.mixedreality.models.SkuTier;
import com.azure.resourcemanager.mixedreality.models.SpatialAnchorsAccountPage;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SpatialAnchorsAccountPageTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SpatialAnchorsAccountPage model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"storageAccountName\":\"tbzaqsqsycbkbfk\",\"accountId\":\"kdkexxp\",\"accountDomain\":\"fmxa\"},\"identity\":{\"principalId\":\"jpgd\",\"tenantId\":\"ocjjxhvpmouexh\",\"type\":\"SystemAssigned\"},\"plan\":{\"principalId\":\"qeojnxqbzvddntw\",\"tenantId\":\"eic\",\"type\":\"SystemAssigned\"},\"sku\":{\"name\":\"pzaoqvuhr\",\"tier\":\"Free\",\"size\":\"cyddglmjthjqk\",\"family\":\"yeicxmqciwqvhk\",\"capacity\":1053923929},\"kind\":{\"name\":\"igdtopbob\",\"tier\":\"Basic\",\"size\":\"m\",\"family\":\"u\",\"capacity\":248377661},\"location\":\"hrzayvvtpgvdf\",\"tags\":{\"efgugnxk\":\"tkftutqxlngx\",\"hjybigehoqfbo\":\"xdqmidtthzrvqdra\",\"zlcuiywgqywgndrv\":\"skanyk\",\"ocpecfvmmco\":\"nhzgpphrcgyn\"},\"id\":\"fsxlzevgbmqjqa\",\"name\":\"c\",\"type\":\"pmivkwlzu\"},{\"properties\":{\"storageAccountName\":\"fwnfnb\",\"accountId\":\"fionl\",\"accountDomain\":\"x\"},\"identity\":{\"principalId\":\"gtzxdpn\",\"tenantId\":\"qqwx\",\"type\":\"SystemAssigned\"},\"plan\":{\"principalId\":\"llnwsubi\",\"tenantId\":\"jampmngnzscxaqw\",\"type\":\"SystemAssigned\"},\"sku\":{\"name\":\"cbonqvpk\",\"tier\":\"Premium\",\"size\":\"njeaseipheofloke\",\"family\":\"ienjbdlwtgr\",\"capacity\":1420069098},\"kind\":{\"name\":\"pj\",\"tier\":\"Premium\",\"size\":\"xazjpqyegual\",\"family\":\"xxhejjzzvd\",\"capacity\":572482803},\"location\":\"dslfhotwmcy\",\"tags\":{\"ltyfsop\":\"lbjnpgacftadehx\",\"nzwdejba\":\"usue\",\"xdn\":\"orxzdmohctbqvud\",\"wdkcglhsl\":\"nvowgujju\"},\"id\":\"zj\",\"name\":\"yggdtjixh\",\"type\":\"kuofqweykhme\"},{\"properties\":{\"storageAccountName\":\"fyexfwhy\",\"accountId\":\"i\",\"accountDomain\":\"yvdcsitynnaa\"},\"identity\":{\"principalId\":\"ctehfiqscjey\",\"tenantId\":\"hezrkgq\",\"type\":\"SystemAssigned\"},\"plan\":{\"principalId\":\"fovgmkqsleyyvxy\",\"tenantId\":\"pkc\",\"type\":\"SystemAssigned\"},\"sku\":{\"name\":\"ngj\",\"tier\":\"Basic\",\"size\":\"zsqpjhvmdajvny\",\"family\":\"unqecanoae\",\"capacity\":1901274446},\"kind\":{\"name\":\"yhltrpmopjmcm\",\"tier\":\"Free\",\"size\":\"kthfui\",\"family\":\"odsfcpkvxodpuozm\",\"capacity\":466984415},\"location\":\"agfuaxbezyiu\",\"tags\":{\"surex\":\"twhrdxwzywqsm\"},\"id\":\"moryocfsfksym\",\"name\":\"dystkiiuxhqyud\",\"type\":\"o\"},{\"properties\":{\"storageAccountName\":\"nbpoczvyifqrvkdv\",\"accountId\":\"llr\",\"accountDomain\":\"vdfwatkpn\"},\"identity\":{\"principalId\":\"exxbczwtr\",\"tenantId\":\"iqzbq\",\"type\":\"SystemAssigned\"},\"plan\":{\"principalId\":\"myokacspkwlh\",\"tenantId\":\"obpxjmflbvvn\",\"type\":\"SystemAssigned\"},\"sku\":{\"name\":\"cciw\",\"tier\":\"Free\",\"size\":\"qkhr\",\"family\":\"jiwkuofoskghsau\",\"capacity\":2118838793},\"kind\":{\"name\":\"mvxi\",\"tier\":\"Standard\",\"size\":\"gidyjrrf\",\"family\":\"aos\",\"capacity\":499062312},\"location\":\"sonpclhocohs\",\"tags\":{\"ffeii\":\"vleggzfbuhfmvfax\"},\"id\":\"hl\",\"name\":\"m\",\"type\":\"zy\"}],\"nextLink\":\"hxmzsbbzoggig\"}")
                .toObject(SpatialAnchorsAccountPage.class);
        Assertions.assertEquals("hrzayvvtpgvdf", model.value().get(0).location());
        Assertions.assertEquals("tkftutqxlngx", model.value().get(0).tags().get("efgugnxk"));
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, model.value().get(0).plan().type());
        Assertions.assertEquals("pzaoqvuhr", model.value().get(0).sku().name());
        Assertions.assertEquals(SkuTier.FREE, model.value().get(0).sku().tier());
        Assertions.assertEquals("cyddglmjthjqk", model.value().get(0).sku().size());
        Assertions.assertEquals("yeicxmqciwqvhk", model.value().get(0).sku().family());
        Assertions.assertEquals(1053923929, model.value().get(0).sku().capacity());
        Assertions.assertEquals("igdtopbob", model.value().get(0).kind().name());
        Assertions.assertEquals(SkuTier.BASIC, model.value().get(0).kind().tier());
        Assertions.assertEquals("m", model.value().get(0).kind().size());
        Assertions.assertEquals("u", model.value().get(0).kind().family());
        Assertions.assertEquals(248377661, model.value().get(0).kind().capacity());
        Assertions.assertEquals("tbzaqsqsycbkbfk", model.value().get(0).storageAccountName());
        Assertions.assertEquals("hxmzsbbzoggig", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SpatialAnchorsAccountPage model =
            new SpatialAnchorsAccountPage()
                .withValue(
                    Arrays
                        .asList(
                            new SpatialAnchorsAccountInner()
                                .withLocation("hrzayvvtpgvdf")
                                .withTags(
                                    mapOf(
                                        "efgugnxk",
                                        "tkftutqxlngx",
                                        "hjybigehoqfbo",
                                        "xdqmidtthzrvqdra",
                                        "zlcuiywgqywgndrv",
                                        "skanyk",
                                        "ocpecfvmmco",
                                        "nhzgpphrcgyn"))
                                .withIdentity(new Identity().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
                                .withPlan(new Identity().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
                                .withSku(
                                    new Sku()
                                        .withName("pzaoqvuhr")
                                        .withTier(SkuTier.FREE)
                                        .withSize("cyddglmjthjqk")
                                        .withFamily("yeicxmqciwqvhk")
                                        .withCapacity(1053923929))
                                .withKind(
                                    new Sku()
                                        .withName("igdtopbob")
                                        .withTier(SkuTier.BASIC)
                                        .withSize("m")
                                        .withFamily("u")
                                        .withCapacity(248377661))
                                .withStorageAccountName("tbzaqsqsycbkbfk"),
                            new SpatialAnchorsAccountInner()
                                .withLocation("dslfhotwmcy")
                                .withTags(
                                    mapOf(
                                        "ltyfsop",
                                        "lbjnpgacftadehx",
                                        "nzwdejba",
                                        "usue",
                                        "xdn",
                                        "orxzdmohctbqvud",
                                        "wdkcglhsl",
                                        "nvowgujju"))
                                .withIdentity(new Identity().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
                                .withPlan(new Identity().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
                                .withSku(
                                    new Sku()
                                        .withName("cbonqvpk")
                                        .withTier(SkuTier.PREMIUM)
                                        .withSize("njeaseipheofloke")
                                        .withFamily("ienjbdlwtgr")
                                        .withCapacity(1420069098))
                                .withKind(
                                    new Sku()
                                        .withName("pj")
                                        .withTier(SkuTier.PREMIUM)
                                        .withSize("xazjpqyegual")
                                        .withFamily("xxhejjzzvd")
                                        .withCapacity(572482803))
                                .withStorageAccountName("fwnfnb"),
                            new SpatialAnchorsAccountInner()
                                .withLocation("agfuaxbezyiu")
                                .withTags(mapOf("surex", "twhrdxwzywqsm"))
                                .withIdentity(new Identity().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
                                .withPlan(new Identity().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
                                .withSku(
                                    new Sku()
                                        .withName("ngj")
                                        .withTier(SkuTier.BASIC)
                                        .withSize("zsqpjhvmdajvny")
                                        .withFamily("unqecanoae")
                                        .withCapacity(1901274446))
                                .withKind(
                                    new Sku()
                                        .withName("yhltrpmopjmcm")
                                        .withTier(SkuTier.FREE)
                                        .withSize("kthfui")
                                        .withFamily("odsfcpkvxodpuozm")
                                        .withCapacity(466984415))
                                .withStorageAccountName("fyexfwhy"),
                            new SpatialAnchorsAccountInner()
                                .withLocation("sonpclhocohs")
                                .withTags(mapOf("ffeii", "vleggzfbuhfmvfax"))
                                .withIdentity(new Identity().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
                                .withPlan(new Identity().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
                                .withSku(
                                    new Sku()
                                        .withName("cciw")
                                        .withTier(SkuTier.FREE)
                                        .withSize("qkhr")
                                        .withFamily("jiwkuofoskghsau")
                                        .withCapacity(2118838793))
                                .withKind(
                                    new Sku()
                                        .withName("mvxi")
                                        .withTier(SkuTier.STANDARD)
                                        .withSize("gidyjrrf")
                                        .withFamily("aos")
                                        .withCapacity(499062312))
                                .withStorageAccountName("nbpoczvyifqrvkdv")))
                .withNextLink("hxmzsbbzoggig");
        model = BinaryData.fromObject(model).toObject(SpatialAnchorsAccountPage.class);
        Assertions.assertEquals("hrzayvvtpgvdf", model.value().get(0).location());
        Assertions.assertEquals("tkftutqxlngx", model.value().get(0).tags().get("efgugnxk"));
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, model.value().get(0).plan().type());
        Assertions.assertEquals("pzaoqvuhr", model.value().get(0).sku().name());
        Assertions.assertEquals(SkuTier.FREE, model.value().get(0).sku().tier());
        Assertions.assertEquals("cyddglmjthjqk", model.value().get(0).sku().size());
        Assertions.assertEquals("yeicxmqciwqvhk", model.value().get(0).sku().family());
        Assertions.assertEquals(1053923929, model.value().get(0).sku().capacity());
        Assertions.assertEquals("igdtopbob", model.value().get(0).kind().name());
        Assertions.assertEquals(SkuTier.BASIC, model.value().get(0).kind().tier());
        Assertions.assertEquals("m", model.value().get(0).kind().size());
        Assertions.assertEquals("u", model.value().get(0).kind().family());
        Assertions.assertEquals(248377661, model.value().get(0).kind().capacity());
        Assertions.assertEquals("tbzaqsqsycbkbfk", model.value().get(0).storageAccountName());
        Assertions.assertEquals("hxmzsbbzoggig", model.nextLink());
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