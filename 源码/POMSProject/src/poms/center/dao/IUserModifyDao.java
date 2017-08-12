package poms.center.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import poms.center.entity.UserModify;

public interface IUserModifyDao {
	
	public int insertUserModify(UserModify userModify);
	public int updateUserModify(UserModify userModify);
	public int deleteUserModify(@Param("userModifyID")int userModifyID);
	public List<UserModify> selectUserModifyList();
	public List<UserModify> selectUserModifyListByType(@Param("type")int type);

}
