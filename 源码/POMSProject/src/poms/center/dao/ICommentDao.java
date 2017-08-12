package poms.center.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import poms.center.entity.Comment;

public interface ICommentDao {
	public int insertComment(Comment comment);

	public List<Comment> selectAllComment(@Param("stationID") int stationID);

	public List<Comment> selectCommentByType(@Param("stationID") int stationID, @Param("commentType") int commentType);

	public List<Comment> selectCommentByID(@Param("stationID") int stationID, @Param("recordID") int recordID);

	public int updateComment(Comment comment);

	public List<Comment> selectCommentByTypeAndCustomerID(@Param("stationID") int stationID,
			@Param("customerID") int customerID, @Param("commentType") int commentType);
}
