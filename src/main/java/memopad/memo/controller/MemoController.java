package memopad.memo.controller;

import memopad.memo.model.Memo;
import memopad.memo.repository.MemoRepository;
import memopad.memo.service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/memo")
public class MemoController {

    @Autowired
    private MemoRepository memoRepository;

    @GetMapping
    public List<Memo> getAllMemos(){
        return memoRepository.findAll();
    }

    @PostMapping
    public Memo addMemo(@RequestBody Memo memo) {
        return memoRepository.save(memo);
    }

}
