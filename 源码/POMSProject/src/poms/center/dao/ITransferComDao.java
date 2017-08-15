package poms.center.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import poms.center.entity.TransferCom;

public interface ITransferComDao {
	
	public int insertTransferCom(TransferCom transferCom);
	public int updateTransferCom(TransferCom transferCom);
	public int deleteTransferCom(@Param("transferComID")int trasnferComID);
	public List<TransferCom> selectTransferComList(@Param("begin") int begin);
	public List<TransferCom> selectTransferComByID(@Param("transferComID")int transferComID);
	public List<TransferCom> selectTransferComListByName(@Param("transferComName")String transferComName,@Param("begin") int begin);

}
