// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ForecastingModels;
import com.azure.resourcemanager.machinelearning.models.ForecastingTrainingSettings;
import com.azure.resourcemanager.machinelearning.models.StackEnsembleSettings;
import com.azure.resourcemanager.machinelearning.models.StackMetaLearnerType;
import java.time.Duration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ForecastingTrainingSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ForecastingTrainingSettings model =
            BinaryData
                .fromString(
                    "{\"allowedTrainingAlgorithms\":[\"RandomForest\",\"TCNForecaster\",\"LightGBM\"],\"blockedTrainingAlgorithms\":[\"RandomForest\",\"Prophet\"],\"enableDnnTraining\":false,\"enableModelExplainability\":false,\"enableOnnxCompatibleModels\":false,\"enableStackEnsemble\":false,\"enableVoteEnsemble\":true,\"ensembleModelDownloadTimeout\":\"PT217H25M43S\",\"stackEnsembleSettings\":{\"stackMetaLearnerKWargs\":\"datadyedmzrgjfo\",\"stackMetaLearnerTrainPercentage\":17.660910285057906,\"stackMetaLearnerType\":\"LightGBMRegressor\"}}")
                .toObject(ForecastingTrainingSettings.class);
        Assertions.assertEquals(false, model.enableDnnTraining());
        Assertions.assertEquals(false, model.enableModelExplainability());
        Assertions.assertEquals(false, model.enableOnnxCompatibleModels());
        Assertions.assertEquals(false, model.enableStackEnsemble());
        Assertions.assertEquals(true, model.enableVoteEnsemble());
        Assertions.assertEquals(Duration.parse("PT217H25M43S"), model.ensembleModelDownloadTimeout());
        Assertions.assertEquals(17.660910285057906D, model.stackEnsembleSettings().stackMetaLearnerTrainPercentage());
        Assertions
            .assertEquals(
                StackMetaLearnerType.LIGHT_GBMREGRESSOR, model.stackEnsembleSettings().stackMetaLearnerType());
        Assertions.assertEquals(ForecastingModels.RANDOM_FOREST, model.allowedTrainingAlgorithms().get(0));
        Assertions.assertEquals(ForecastingModels.RANDOM_FOREST, model.blockedTrainingAlgorithms().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ForecastingTrainingSettings model =
            new ForecastingTrainingSettings()
                .withEnableDnnTraining(false)
                .withEnableModelExplainability(false)
                .withEnableOnnxCompatibleModels(false)
                .withEnableStackEnsemble(false)
                .withEnableVoteEnsemble(true)
                .withEnsembleModelDownloadTimeout(Duration.parse("PT217H25M43S"))
                .withStackEnsembleSettings(
                    new StackEnsembleSettings()
                        .withStackMetaLearnerKWargs("datadyedmzrgjfo")
                        .withStackMetaLearnerTrainPercentage(17.660910285057906D)
                        .withStackMetaLearnerType(StackMetaLearnerType.LIGHT_GBMREGRESSOR))
                .withAllowedTrainingAlgorithms(
                    Arrays
                        .asList(
                            ForecastingModels.RANDOM_FOREST,
                            ForecastingModels.TCNFORECASTER,
                            ForecastingModels.LIGHT_GBM))
                .withBlockedTrainingAlgorithms(
                    Arrays.asList(ForecastingModels.RANDOM_FOREST, ForecastingModels.PROPHET));
        model = BinaryData.fromObject(model).toObject(ForecastingTrainingSettings.class);
        Assertions.assertEquals(false, model.enableDnnTraining());
        Assertions.assertEquals(false, model.enableModelExplainability());
        Assertions.assertEquals(false, model.enableOnnxCompatibleModels());
        Assertions.assertEquals(false, model.enableStackEnsemble());
        Assertions.assertEquals(true, model.enableVoteEnsemble());
        Assertions.assertEquals(Duration.parse("PT217H25M43S"), model.ensembleModelDownloadTimeout());
        Assertions.assertEquals(17.660910285057906D, model.stackEnsembleSettings().stackMetaLearnerTrainPercentage());
        Assertions
            .assertEquals(
                StackMetaLearnerType.LIGHT_GBMREGRESSOR, model.stackEnsembleSettings().stackMetaLearnerType());
        Assertions.assertEquals(ForecastingModels.RANDOM_FOREST, model.allowedTrainingAlgorithms().get(0));
        Assertions.assertEquals(ForecastingModels.RANDOM_FOREST, model.blockedTrainingAlgorithms().get(0));
    }
}
