package anno.study.ex4;

import org.springframework.stereotype.Component;

@Component //xml �� canadatire �� ���
public class CanadaTire implements Tire{

	@Override
	public String getTireName() {
		return "ĳ����Ÿ�̾�";
	}
	
}