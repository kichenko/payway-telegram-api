/*
 * (c) Payway, 2015. All right reserved.
 */
package com.payway.telegram.api.tl.schema.generator;

/**
 * JavaTemplate
 *
 * @author Sergey Kichenko
 * @created 08.12.2015
 */
public final class JavaTemplate {

    public final static String JAVA_IMPORTS = "import " + JavaConfigConstant.JAVA_CORE_PACKAGE + ".*;\n"
            + "import java.io.*;\n\n"
            + "import static " + JavaConfigConstant.JAVA_CORE_UTILS_PACKAGE + ".StreamingUtils.*;\n";

    public final static String JAVA_CLASS_TEMPLATE = "package {package};\n\n"
            + JAVA_IMPORTS
            + "\npublic class {name} extends TLObject {\n\n"
            + "public static final int CLASS_ID = {class_id};\n\n"
            + "{fields}\n"
            + "public {name}() {}\n\n{constructor}\n"
            + "public int getClassId() {\nreturn CLASS_ID;\n}\n"
            + "{getter-setters}\n{serialize}\n{deserialize}\n{to_string}\n}\n";

    public final static String JAVA_REQUSTER_TEMPLATE = "package {package};\n\n"
            + JAVA_IMPORTS
            + "\nimport {package}.requests.*;\n"
            + "\npublic class TLApiRequester {\n\nprivate RequestExecutor executor;\n"
            + "private TLContext context;\n\n"
            + "public TLApiRequester(RequestExecutor executor, TLContext context) {\n"
            + "this.executor = executor;\n"
            + "this.context = context;\n}\n\n"
            + "protected <T extends TLObject> T doRpcCall(TLMethod<T> method) throws IOException {\n"
            + "return method.deserializeResponse(executor.doRpcCall(method.serialize()), context);\n}\n"
            + "{methods}\n\n}\n";

    public final static String JAVA_REQUESTER_METHOD = "public {return_type} {method_name}({args}) throws IOException {\n"
            + "return doRpcCall(new {method_class}({method_args}));\n}\n\n";

    public final static String JAVA_CONTEXT_TEMPLATE = "package {package};\n\n"
            + JAVA_IMPORTS
            + "\npublic class TLApiContext extends TLContext {\n\n"
            + "protected void init() {\n{init}\n}\n}\n";

    public final static String JAVA_CONTEXT_INT_RECORD = "\nregisterClass({id}, {type}.class);";

    public final static String JAVA_METHOD_TEMPLATE = "package {package};\n\n"
            + JAVA_IMPORTS
            + "\npublic class {name} extends TLMethod<{return_type}> {\n\n"
            + "public static final int CLASS_ID = {class_id};\n\n"
            + "{fields}\n"
            + "{constructor}\n{responseParser}\n{getter-setters}\n"
            + "public int getClassId() {\nreturn CLASS_ID;\n}\n"
            + "{serialize}\n{deserialize}\n{to_string}\n}\n";

    public final static String JAVA_METHOD_PARSER_METHOD_BODY_GENERAL
            = "TLObject res = readTLObject(stream, context);\n"
            + "if (res == null){throw new IOException(\"Unable to parse response\");}\n"
            + "if (res instanceof {return_type}) {return ({return_type})res;}\n"
            + "else { throw new IOException(\"Incorrect response type. Expected {return_type}, got: \" + res.getClass().getCanonicalName()); }";

    public final static String JAVA_METHOD_PARSER_METHOD_BODY_VECTOR = "return readTLVector(stream, context)";
    public final static String JAVA_METHOD_PARSER_METHOD_BODY_INT_VECTOR = "return readTLIntVector(stream, context);";
    public final static String JAVA_METHOD_PARSER_METHOD_BODY_LONG_VECTOR = "return readTLLongVector(stream, context);";
    public final static String JAVA_METHOD_PARSER_METHOD_BODY_REFERENCE = "return ({return_type}) {int}.deserializeResponse(stream, context);";

    public final static String JAVA_METHOD_PARSER_TEMPLATE
            = "public {return_type} deserializeResponse(InputStream stream, TLContext context) throws IOException {\n{body}\n}\n";

    public final static String JAVA_ABS_CLASS_TEMPLATE
            = "package {package};\n\n"
            + JAVA_IMPORTS
            + "\npublic abstract class {name} extends TLObject {\n\n{fields}\n{getter-setters}\n}";

    public final static String JAVA_CHILD_CLASS_TEMPLATE
            = "package {package};\n\n"
            + JAVA_IMPORTS
            + "\npublic class {name} extends {base-name} { \n\npublic static final int CLASS_ID = {class_id};\n\n"
            + "{fields}\n"
            + "public {name}() {}\n\n{constructor}\n"
            + "public int getClassId() {\nreturn CLASS_ID;\n}"
            + "\n{getter-setters}\n{serialize}\n{deserialize}\n{to_string}\n}";

    public final static String JAVA_TO_STRING_TEMPLATE = "@Override\npublic String toString() {\nreturn \"{value}\";\n}";

    public final static String JAVA_FIELD_TEMPLATE = "protected {type} {int};\n";

    public final static String JAVA_GETTER_SETTER_TEMPLATE
            = "public {type} {getter}() {\nreturn {int};\n}\n\n"
            + "public void {setter}({type} value) {\nthis.{int} = value;\n}\n\n";

    public final static String JAVA_DESERIALIZE_TEMPLATE
            = "@Override\npublic void deserializeBody(InputStream stream, TLContext context) throws IOException {{body}\n}\n";

    public final static String JAVA_SERIALIZE_TEMPLATE = "@Override\npublic void serializeBody(OutputStream stream) throws IOException {{body}\n}\n";

    public final static String JAVA_CONSTRUCTOR_TEMPLATE = "public {name} ({args}) {{body}\n}\n";

    public final static String JAVA_CONSTRUCTOR_ARG_TEMPLATE = "{type} {int}";

    public final static String JAVA_CONSTRUCTOR_BODY_TEMPLATE = "\nthis.{int} = {int};";

    public final static String JAVA_SERIALIZE_INT = "\nwriteInt(this.{int}, stream);";
    public final static String JAVA_DESERIALIZE_INT = "\nthis.{int} = readInt(stream);";

    public final static String JAVA_SERIALIZE_LONG = "\nwriteLong(this.{int}, stream);";
    public final static String JAVA_DESERIALIZE_LONG = "\nthis.{int} = readLong(stream);";

    public final static String JAVA_SERIALIZE_DOUBLE = "\nwriteDouble(this.{int}, stream);";
    public final static String JAVA_DESERIALIZE_DOUBLE = "\nthis.{int} = readDouble(stream);";

    public final static String JAVA_SERIALIZE_STRING = "\nwriteTLString(this.{int}, stream);";
    public final static String JAVA_DESERIALIZE_STRING = "\nthis.{int} = readTLString(stream);";

    public final static String JAVA_SERIALIZE_BOOLEAN = "\nwriteTLBool(this.{int}, stream);";
    public final static String JAVA_DESERIALIZE_BOOLEAN = "\nthis.{int} = readTLBool(stream);";

    public final static String JAVA_SERIALIZE_BYTES = "\nwriteTLBytes(this.{int}, stream);";
    public final static String JAVA_DESERIALIZE_BYTES = "\nthis.{int} = readTLBytes(stream, context);";

    public final static String JAVA_SERIALIZE_OBJECT = "\nwriteTLObject(this.{int}, stream);";
    public final static String JAVA_DESERIALIZE_OBJECT = "\nthis.{int} = ({type})readTLObject(stream, context);";

    public final static String JAVA_SERIALIZE_FUNCTIONAL = "\nwriteTLMethod(this.{int}, stream);";
    public final static String JAVA_DESERIALIZE_FUNCTIONAL = "\nthis.{int} = readTLMethod(stream, context);";

    public final static String JAVA_SERIALIZE_VECTOR = "\nwriteTLVector(this.{int}, stream);";
    public final static String JAVA_DESERIALIZE_VECTOR = "\nthis.{int} = readTLVector(stream, context);";

    public final static String JAVA_DESERIALIZE_INT_VECTOR = "\nthis.{int} = readTLIntVector(stream, context);";
    public final static String JAVA_DESERIALIZE_STRING_VECTOR = "\nthis.{int} = readTLStringVector(stream, context);";
    public final static String JAVA_DESERIALIZE_LONG_VECTOR = "\nthis.{int} = readTLLongVector(stream, context);";

}
