package anno.study.ex4;

import org.springframework.stereotype.Component;

@Component //xml �� koreatire �� ���
public class KoreaTire implements Tire{

	@Override
	public String getTireName() {
		return "�ѱ�Ÿ�̾�";
	}
	
}