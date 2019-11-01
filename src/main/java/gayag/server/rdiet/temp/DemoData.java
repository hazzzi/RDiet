package gayag.server.rdiet.temp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DemoData {

    @Autowired
    private TempRepository tempRepository;

    @Bean
    public ApplicationRunner applicationRunner(){
        // application 처음 실행할때 같이 실행되는 메소드
        // 아래 데이터가 임시로 DB에 들어가게된다
        // 콘솔에 찍히는 로그 확인하면 이해할듯
        // localhost:8080/list 조회하면 아래 데이터가 json 형태로 뿌려지는것을 확인 할 수 있따.
        return args -> {
            tempRepository.save(new Temp(null, "제목1", "내용1"));
            tempRepository.save(new Temp(null, "제목2", "내용2"));
            tempRepository.save(new Temp(null, "제목3", "내용3"));
        };
    }
}
