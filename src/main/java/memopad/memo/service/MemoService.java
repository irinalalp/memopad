package memopad.memo.service;

import memopad.memo.model.Memo;

import java.util.List;

public interface MemoService {
    List<Memo> getAllMemos();
    Memo saveMemo(Memo memo);
    Memo getMemoById(long id);
    void deleteMemoById(long id);
}
