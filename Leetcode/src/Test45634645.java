import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test45634645 {

	public static void main(String[] args) {
		
		List list = Arrays.asList(1,2,3,4,5);
		
		Optional a = list.stream().sorted().skip(3).findFirst();
		
		System.out.println(a);
	}

}
