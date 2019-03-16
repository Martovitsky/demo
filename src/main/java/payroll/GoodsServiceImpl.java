package payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class GoodsServiceImpl implements GoodsService{
    @Autowired
    private GoodsRepository goodsRepository;

    @Override
    public List<Goods> getAll() {
        return goodsRepository.findAll();
    }


    @Override
    public void deleteById(Long id) {

        goodsRepository.deleteById(id);

    }

    @Override
    public Goods findById(Long id) {  return goodsRepository.findById(id).get();}

    @Override
    public Goods editGoods(Goods goods){
        return goodsRepository.saveAndFlush(goods);
    }


    @Override
    public void add(Goods goods) {
        goodsRepository.save(goods);
    }
}

