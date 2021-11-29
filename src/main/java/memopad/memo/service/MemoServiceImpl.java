package memopad.memo.service;

import memopad.memo.model.Memo;
import memopad.memo.repository.MemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemoServiceImpl implements MemoService {

    @Autowired
    private MemoRepository memoRepository;

    @Override
    public List<Memo> getAllMemos() {
        return memoRepository.findAll();
    }

    @Override
    public Memo saveMemo(Memo memo) {
        this.memoRepository.save(memo);
        return memo;
    }

    @Override
    public Memo getMemoById(long id) {
        Optional<Memo> optional = memoRepository.findById(id);
        Memo memo = null;
        if (optional.isPresent()){
            memo=optional.get();
        } else {
            throw new RuntimeException("Memo not found");
        }
        return memo;
    }

    @Override
    public void deleteMemoById(long id) {
        this.memoRepository.deleteById(id);
    }
}
