package anno.study.ex4;

import org.springframework.stereotype.Component;

@Component //xml 에 koreatire 로 등록
public class KoreaTire implements Tire{

	@Override
	public String getTireName() {
		return "한국타이어";
	}
	
}