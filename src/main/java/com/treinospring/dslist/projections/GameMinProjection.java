package com.treinospring.dslist.projections;

public interface GameMinProjection {

    Long getID();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();

}
