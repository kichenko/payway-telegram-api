/*
 * (c) Payway, 2015. All right reserved.
 */
package com.payway.telegram.api.tl.schema.generator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.payway.telegram.api.tl.schema.generator.TLGeneratorModel.TLModel;
import com.payway.telegram.api.tl.schema.generator.TLGeneratorSyntax.TLDefinition;
import com.payway.telegram.api.tl.schema.generator.TLJavaModel.JavaModel;
import java.io.File;

/**
 * AppMain
 *
 * @author Sergey Kichenko
 * @created 07.12.2015
 */
public class AppMain {

    public static void main(String[] args) throws Exception {

        final File scrFolder = new File("c:/tl.json");
        final File dstFolder = new File("c:/");

        final ObjectMapper mapper = new ObjectMapper();

        final JsonNode sourceJsonTree = mapper.readValue(scrFolder, JsonNode.class);
        final TLDefinition definition = TLGeneratorSyntax.buildFromJson(sourceJsonTree);

        TLGeneratorSyntax.checkDefinition(definition);
        final TLModel model = TLGeneratorModel.buildModel(definition);
        final JavaModel javaModel = TLJavaModel.convertToJavaModel(model);
        TLJavaModel.writeJavaClasses(javaModel, dstFolder + "/src/");
    }
}
