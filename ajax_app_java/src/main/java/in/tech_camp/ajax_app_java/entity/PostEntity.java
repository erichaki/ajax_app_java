package in.tech_camp.ajax_app_java.entity;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class PostEntity {
  private Integer id;
  private String content;
  private Timestamp createdAt;
}
