package poms.center.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import poms.center.entity.TransferCom;

public interface ITransferComDao {
	
	public int insertTransferCom(TransferCom transferCom);
	public int updateTransferCom(TransferCom transferCom);
	public int deleteTransferCom(@Param("companyID")int companyID);
	public List<TransferCom> selectTransferComList(@Param("begin") int begin);
	public List<TransferCom> selectTransferComByID(@Param("companyID")int transferComID);
	public List<TransferCom> selectTransferComListByName(@Param("companyName")String transferComName,@Param("begin") int begin);

}
