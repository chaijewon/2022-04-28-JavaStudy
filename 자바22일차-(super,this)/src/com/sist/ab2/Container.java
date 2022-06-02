package com.sist.ab2;
import java.util.*;
// 스프링 (Factory 패턴)
public class Container {
   private Map map=new HashMap();
   public Container()
   {
	   map.put("member", new Member());
	   map.put("board", new Board());
	   map.put("food", new Food());
	   map.put("notice", new Notice());
	   map.put("recipe", new Recipe());
   }
   public Object getBean(String id)
   {
	   return map.get(id);
   }
}
