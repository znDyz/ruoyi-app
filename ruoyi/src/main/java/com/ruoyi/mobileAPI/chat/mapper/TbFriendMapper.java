package com.ruoyi.mobileAPI.chat.mapper;

import java.util.List;
import com.ruoyi.mobileAPI.chat.domain.TbFriend;

/**
 * 聊天功能Mapper接口
 * 
 * @author ruoyi
 * @date 2020-03-22
 */
public interface TbFriendMapper 
{
    /**
     * 查询聊天功能
     * 
     * @param id 聊天功能ID
     * @return 聊天功能
     */
    public TbFriend selectTbFriendById(String id);

    /**
     * 查询聊天功能列表
     * 
     * @param tbFriend 聊天功能
     * @return 聊天功能集合
     */
    public List<TbFriend> selectTbFriendList(TbFriend tbFriend);

    /**
     * 新增聊天功能
     * 
     * @param tbFriend 聊天功能
     * @return 结果
     */
    public int insertTbFriend(TbFriend tbFriend);

    /**
     * 修改聊天功能
     * 
     * @param tbFriend 聊天功能
     * @return 结果
     */
    public int updateTbFriend(TbFriend tbFriend);

    /**
     * 删除聊天功能
     * 
     * @param id 聊天功能ID
     * @return 结果
     */
    public int deleteTbFriendById(String id);

    /**
     * 批量删除聊天功能
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbFriendByIds(String[] ids);
}
