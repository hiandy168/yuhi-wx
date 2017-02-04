package com.yuhi.wechar.facade;

import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.alibaba.fastjson.JSONObject;
import com.yuhi.wechar.entity.MapData;
/**
* User: lsl
* Date: 13-8-26
* Time: 上午1:57
* To change this template use File | Settings | File Templates.
*/
@Path("/projectOwnermesService")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public interface ProjectOwnermesFacade {
	/**
	 * 删除实体
	 * @param id
	 * @return
	 */
	@POST
	@Path("/delete/{id}")
	public  boolean delete(@PathParam(value = "id")String id) throws Exception;
	/**
	 * 保存实体
	 * @param entity
	 * @return
	 */
	@POST
 	public boolean  save(JSONObject entity) throws Exception;
	/**
	 * 修改实体
	 * @param paramMap
	 * @param id
	 * @return
	 */
	@POST
	@Path("/update/{id}")
 	public boolean  Update(Map<String, Object> paramMap,@PathParam(value = "id") String id) throws Exception;
	/**
	 * 根据id获取单个实体
	 * @param openid
	 * @return
	 */
	@GET
	@Path("/getObjByid/{id}")
	public JSONObject getObjByid(@PathParam(value = "id") String id) throws Exception;
	/**
	 * 获取集合
	 * @return
	 */
	@GET
	public List<JSONObject> getList() throws Exception;
	/**********************自定义接口******************************/
	@POST
	@Path("/datagrid/{pagenum}/{pagesize}")
	public String datagrid(MapData md,@PathParam(value = "pagenum")Integer pageNum,@PathParam(value = "pagesize") Integer pagesize) throws Exception;

}