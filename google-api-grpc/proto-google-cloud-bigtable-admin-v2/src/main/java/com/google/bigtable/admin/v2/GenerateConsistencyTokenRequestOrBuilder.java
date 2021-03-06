// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/bigtable_table_admin.proto

package com.google.bigtable.admin.v2;

public interface GenerateConsistencyTokenRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.GenerateConsistencyTokenRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The unique name of the Table for which to create a consistency token.
   * Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The unique name of the Table for which to create a consistency token.
   * Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
