// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/file_system_master.proto

package alluxio.grpc;

public interface UfsInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.file.UfsInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string uri = 1;</code>
   */
  boolean hasUri();
  /**
   * <code>optional string uri = 1;</code>
   */
  java.lang.String getUri();
  /**
   * <code>optional string uri = 1;</code>
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <code>optional .alluxio.grpc.file.MountPOptions properties = 2;</code>
   */
  boolean hasProperties();
  /**
   * <code>optional .alluxio.grpc.file.MountPOptions properties = 2;</code>
   */
  alluxio.grpc.MountPOptions getProperties();
  /**
   * <code>optional .alluxio.grpc.file.MountPOptions properties = 2;</code>
   */
  alluxio.grpc.MountPOptionsOrBuilder getPropertiesOrBuilder();
}
