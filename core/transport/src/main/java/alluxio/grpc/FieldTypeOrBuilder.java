// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/catalog_master.proto

package alluxio.grpc;

public interface FieldTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.FieldType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .alluxio.grpc.Repetition repetition = 1;</code>
   */
  boolean hasRepetition();
  /**
   * <code>optional .alluxio.grpc.Repetition repetition = 1;</code>
   */
  alluxio.grpc.Repetition getRepetition();

  /**
   * <code>optional string name = 2;</code>
   */
  boolean hasName();
  /**
   * <code>optional string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional .alluxio.grpc.PrimitiveTypeName type_id = 3;</code>
   */
  boolean hasTypeId();
  /**
   * <code>optional .alluxio.grpc.PrimitiveTypeName type_id = 3;</code>
   */
  alluxio.grpc.PrimitiveTypeName getTypeId();

  /**
   * <code>optional .alluxio.grpc.GroupType group = 4;</code>
   */
  boolean hasGroup();
  /**
   * <code>optional .alluxio.grpc.GroupType group = 4;</code>
   */
  alluxio.grpc.GroupType getGroup();
  /**
   * <code>optional .alluxio.grpc.GroupType group = 4;</code>
   */
  alluxio.grpc.GroupTypeOrBuilder getGroupOrBuilder();

  public alluxio.grpc.FieldType.TypeInfoCase getTypeInfoCase();
}