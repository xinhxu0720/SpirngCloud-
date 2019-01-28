import com.xuxinhui.springcloud.DeptProvider8001_App;
import com.xuxinhui.springcloud.entities.Dept;
import com.xuxinhui.springcloud.service.DeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DeptProvider8001_App.class)
public class SpirngBooTtest {

    @Autowired
    private DeptService deptService;

    @Test
    public void rewr(){
        Dept dept = new Dept();
        dept.setDname("sda");
        System.out.println(deptService.add(dept));
    }
}
