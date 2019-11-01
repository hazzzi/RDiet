package gayag.server.rdiet.temp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class TempService {

    @Autowired
    TempRepository tempRepository;

    public ArrayList<Temp> getData() {
        // DB의 데이터를 가져올때는 바로 Repository에 접근하는것이 아니라
        // @Service를 통해서 가져와야함
        // findAll()을 통해서 DB의 모든 값을 리스트로 받아옴 (select 쿼리가 생성됨)
        return (ArrayList<Temp>) tempRepository.findAll();
    }

    @Transactional
    public void insertData(String subject, String contents) {
        // @Transactional을 통해서 만약 DB에 값이 save 되다가
        // 서버나 다른 문제로 이상이생겼을 때 넣던 값을 rollback 시켜줘서
        // DB에는 값이 들어가지않음

        // save -> JPA의 메소드, 데이터베이스에 값을 저장시켜줌 (insert 쿼리가 생성됨 / update도 마찬가지)
        tempRepository.save(new Temp(null, subject, contents));
    }
}
