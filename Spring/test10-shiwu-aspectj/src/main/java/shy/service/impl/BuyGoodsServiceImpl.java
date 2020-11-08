package shy.service.impl;

import shy.dao.GoodsDao;
import shy.dao.SaleDao;
import shy.domain.Goods;
import shy.domain.Sale;
import shy.excep.NoEnoughException;
import shy.service.BuyGoodsService;

public class BuyGoodsServiceImpl implements BuyGoodsService {
    private SaleDao saleDao;
    private GoodsDao goodsDao;
    @Override
    public void buy(Integer goodsId, Integer nums) {
        System.out.println("buy方法开始");

//        记录销售信息，向sale表添加记录
        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNums(nums);
        saleDao.insertSale(sale);

//        更新库存
        Goods goods = goodsDao.selectGoods(goodsId);
        if (goods == null){
//            商品不存在
            throw new NullPointerException("编号是"+goodsId+"没有这个商品");
        }else if (goods.getAmount() < nums){
            throw new NoEnoughException("编号是"+goodsId+"商品库存不足");
        }

//        修改库存
        Goods buygoods = new Goods();
        buygoods.setId(goodsId);
        buygoods.setAmount(nums);
        goodsDao.updateGoods(buygoods);

        System.out.println("buy方法完成");
    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }
}
