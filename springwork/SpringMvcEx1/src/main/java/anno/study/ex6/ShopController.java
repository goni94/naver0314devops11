package anno.study.ex6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Component("shopcont")
@AllArgsConstructor	//���� ��������� dao �ܿ� ���ٸ� @RequiredArgsConstructor �� �ϴ°� ����
public class ShopController {
	
	//@Autowired, @AllArgsConstructor
	ShopDao dao;
	
	public void insert(String sang,int su,int dan) {
		
		ShopDto dto=new ShopDto(sang,su,dan);
		dao.insert(dto);
		
		dao.selectAll();	
	}
	
	public void delete(String sang)
	{
		dao.delete(sang);
		
		dao.selectAll();
	}
	
	public void update(String sang,int su,int dan)
	{
		ShopDto dto=new ShopDto();
		dto.setSang(sang);
		dto.setSu(su);
		dto.setDan(dan);
		dao.update(dto);
		
		dao.selectAll();
	}
}
