// this class was generated by a tool on Tue Apr 04 14:22:07 EDT 2006

package com.oy.shared.lm.graph.bo;

public class GraphGroupBean implements java.io.Serializable {

  public static class Fields {
      public static final String groupId = "groupId";
      public static final String graphId = "graphId";
      public static final String infoId = "infoId";
  }

  public static class Relations {
      public static final String Graph = "Graph";
      public static final String info = "info";
  }

  public static class Columns {
      public static final String groupId = "";
      public static final String graphId = "";
      public static final String infoId = "";
  }

  private int groupId;
  private int graphId;
  private int infoId;

  private com.oy.shared.lm.graph.bo.GraphBean Graph;
  private com.oy.shared.lm.graph.bo.GroupInfo info;


  public int getGroupId (){
    return this.groupId;
  }

  public void setGroupId (int groupId){
    this.groupId = groupId;
  }

  public int getGraphId (){
    return this.graphId;
  }

  public void setGraphId (int graphId){
    this.graphId = graphId;
  }

  public int getInfoId (){
    return this.infoId;
  }

  public void setInfoId (int infoId){
    this.infoId = infoId;
  }


  public void setGraph (com.oy.shared.lm.graph.bo.GraphBean Graph){
    this.Graph = Graph;
  }

  public com.oy.shared.lm.graph.bo.GraphBean getGraph (){
    return (com.oy.shared.lm.graph.bo.GraphBean) this.Graph;
  }

  public void setInfo (com.oy.shared.lm.graph.bo.GroupInfo info){
    this.info = info;
  }

  public com.oy.shared.lm.graph.bo.GroupInfo getInfo (){
    return (com.oy.shared.lm.graph.bo.GroupInfo) this.info;
  }

  public void copyFieldsFrom(com.oy.shared.lm.graph.bo.GraphGroupBean source) {
    this.groupId = source.groupId;
    this.graphId = source.graphId;
    this.infoId = source.infoId;
  }
}
