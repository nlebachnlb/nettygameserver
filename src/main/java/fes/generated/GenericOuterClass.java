// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: generic.proto

// Protobuf Java Version: 3.25.1
package fes.generated;

public final class GenericOuterClass {
  private GenericOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_network_msg_GenericPacket_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_network_msg_GenericPacket_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rgeneric.proto\022\013network.msg\032\021cmd-schema" +
      "s.proto\032\021msg-schemas.proto\"\350\001\n\rGenericPa" +
      "cket\0224\n\004type\030\001 \001(\0162&.network.msg.Generic" +
      "Packet.GenericType\022-\n\007request\030\002 \001(\0132\027.ne" +
      "twork.cmd.RequestCmdH\000\210\001\001\022/\n\010response\030\003 " +
      "\001(\0132\030.network.msg.ResponseMsgH\001\210\001\001\"(\n\013Ge" +
      "nericType\022\013\n\007REQUEST\020\000\022\014\n\010RESPONSE\020\001B\n\n\010" +
      "_requestB\013\n\t_responseB$\n\rfes.generatedB\021" +
      "GenericOuterClassP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          fes.generated.cmd.CmdOuterClass.getDescriptor(),
          fes.generated.msg.MsgOuterClass.getDescriptor(),
        });
    internal_static_network_msg_GenericPacket_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_network_msg_GenericPacket_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_network_msg_GenericPacket_descriptor,
        new java.lang.String[] { "Type", "Request", "Response", });
    fes.generated.cmd.CmdOuterClass.getDescriptor();
    fes.generated.msg.MsgOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
