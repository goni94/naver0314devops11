package anno.study.ex5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.val;

@Component
@Data
public class Emp {
	@Autowired
	private Sawon sawon;
	@Value("���ø���")
	private String empName;
	@Value("2014-05-17")
	private String ipsaday;
	
	public void sawonInfo()
	{
		System.out.println("** ��� ���� **");
		System.out.println("�Ի��� : "+ipsaday);
		System.out.println("ȸ��� : "+empName);
		System.out.println("����� : "+sawon.getName());
		System.out.println("�ּ� : "+sawon.getAddr());
		System.out.println("���� : "+sawon.getAge());
	}
	
}
