package com.xuxinhui.springcloud.entities;

import java.io.Serializable;
//@SuppressWarnings("serial")
//@AllArgsConstructor//全参构造
//@NoArgsConstructor//无参构造
//@Accessors(chain = true) //链式访问
//@Data

public class Dept implements Serializable { //Entity 实体类
     private Long       deptno; //主键
     private String     dname; //部门名称
     private String     db_source; //来自哪一个数据库

     public Dept() {
          super();
     }

     @Override
     public String toString() {
          return "Dept{" +
                  "deptno=" + deptno +
                  ", dname='" + dname + '\'' +
                  ", db_source='" + db_source + '\'' +
                  '}';
     }

     public Long getDeptno() {
          return deptno;
     }

     public void setDeptno(Long deptno) {
          this.deptno = deptno;
     }

     public String getDname() {
          return dname;
     }

     public void setDname(String dname) {
          this.dname = dname;
     }

     public String getDb_source() {
          return db_source;
     }

     public void setDb_source(String db_source) {
          this.db_source = db_source;
     }

     public static void main(String ars[]){
          Dept dept = new Dept();
          System.out.println(dept);
     }
}


