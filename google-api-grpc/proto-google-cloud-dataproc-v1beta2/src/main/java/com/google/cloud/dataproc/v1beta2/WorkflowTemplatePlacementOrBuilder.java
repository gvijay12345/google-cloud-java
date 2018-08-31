// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/workflow_templates.proto

package com.google.cloud.dataproc.v1beta2;

public interface WorkflowTemplatePlacementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. A cluster that is managed by the workflow.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.ManagedCluster managed_cluster = 1;</code>
   */
  boolean hasManagedCluster();
  /**
   * <pre>
   * Optional. A cluster that is managed by the workflow.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.ManagedCluster managed_cluster = 1;</code>
   */
  com.google.cloud.dataproc.v1beta2.ManagedCluster getManagedCluster();
  /**
   * <pre>
   * Optional. A cluster that is managed by the workflow.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.ManagedCluster managed_cluster = 1;</code>
   */
  com.google.cloud.dataproc.v1beta2.ManagedClusterOrBuilder getManagedClusterOrBuilder();

  /**
   * <pre>
   * Optional. A selector that chooses target cluster for jobs based
   * on metadata.
   * The selector is evaluated at the time each job is submitted.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.ClusterSelector cluster_selector = 2;</code>
   */
  boolean hasClusterSelector();
  /**
   * <pre>
   * Optional. A selector that chooses target cluster for jobs based
   * on metadata.
   * The selector is evaluated at the time each job is submitted.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.ClusterSelector cluster_selector = 2;</code>
   */
  com.google.cloud.dataproc.v1beta2.ClusterSelector getClusterSelector();
  /**
   * <pre>
   * Optional. A selector that chooses target cluster for jobs based
   * on metadata.
   * The selector is evaluated at the time each job is submitted.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.ClusterSelector cluster_selector = 2;</code>
   */
  com.google.cloud.dataproc.v1beta2.ClusterSelectorOrBuilder getClusterSelectorOrBuilder();

  public com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement.PlacementCase getPlacementCase();
}