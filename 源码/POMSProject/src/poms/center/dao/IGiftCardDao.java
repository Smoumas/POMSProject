package poms.center.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import poms.center.entity.GiftCard;

public interface IGiftCardDao {

	public int insertGiftCard(GiftCard giftCard);
	public int updateGiftCard(GiftCard giftCard);
	public int deleteGiftCard(@Param("giftCardID") int giftCardID);
	public List<GiftCard> selectGiftCardList();
	public List<GiftCard> selectGiftCardByID(@Param("giftCardID") int giftCardID);
	
}
