package top.jiangyixin.moneyfeedom.pojo.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author mickle
 */
@Data
public class Category {

  private Long id;
  private String name;
  private Boolean active;
  private Long parentId;
  private User user;
  private Date gmtCreate;
  private Date gmtModified;
}