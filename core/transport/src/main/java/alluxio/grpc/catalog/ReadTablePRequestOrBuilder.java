// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/catalog/catalog_master.proto

package alluxio.grpc.catalog;

public interface ReadTablePRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.catalog.ReadTablePRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string db_name = 1;</code>
   */
  boolean hasDbName();
  /**
   * <code>optional string db_name = 1;</code>
   */
  java.lang.String getDbName();
  /**
   * <code>optional string db_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getDbNameBytes();

  /**
   * <code>optional string table_name = 2;</code>
   */
  boolean hasTableName();
  /**
   * <code>optional string table_name = 2;</code>
   */
  java.lang.String getTableName();
  /**
   * <code>optional string table_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getTableNameBytes();

  /**
   * <code>optional .alluxio.grpc.catalog.Constraint constraint = 3;</code>
   */
  boolean hasConstraint();
  /**
   * <code>optional .alluxio.grpc.catalog.Constraint constraint = 3;</code>
   */
  alluxio.grpc.catalog.Constraint getConstraint();
  /**
   * <code>optional .alluxio.grpc.catalog.Constraint constraint = 3;</code>
   */
  alluxio.grpc.catalog.ConstraintOrBuilder getConstraintOrBuilder();
}