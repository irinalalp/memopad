package memopad.memo.controller;

import com.sun.istack.NotNull;
import memopad.memo.model.Memo;
import memopad.memo.repository.MemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/memo")
public class MemoController {

    @Autowired
    private MemoRepository memoRepository;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

    @GetMapping
    public List<Memo> getAllMemos() {
        return memoRepository.findAll();
    }

    @PostMapping
    public Memo addMemo(@NotNull @RequestBody Memo memo) {
        return memoRepository.save(memo);
    }

    @PutMapping
    public Memo updateMemo(@NotNull @RequestBody Memo memo) {
        return memoRepository.save(memo);
    }

    @DeleteMapping(value="/{id}")
    public void deleteMemo(@PathVariable Long id){
        memoRepository.deleteById(id);
    }
}
