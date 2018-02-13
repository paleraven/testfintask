package sample.data.jpa.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sample.data.jpa.domain.IncomeReport;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
@RunWith(SpringRunner.class)
@SpringBootTest
public class IncomeReportRepositoryIntegrationTests {

	@Autowired
	IncomeReportRepository repository;

	@Test
	public void findAllIncomeReports() {

		List<IncomeReport> incomeReports = this.repository.findAll();
		assertThat(incomeReports.size()).isGreaterThan(0);
	}
}
