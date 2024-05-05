package modelo;

import java.util.concurrent.Callable;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(
		name= "jenv", 
		mixinStandardHelpOptions = true, 
		version = "0.0.1",
		description = "Manage your env files a pro" 
		)
public class JEnv implements Callable<Integer> {

	@Option(names = {"-l", "--list"}, description = "List all the key-values in current directory")
	private boolean isListing;
	
	@Override
	public Integer call() throws Exception {
		if(isListing) {
			return 1;
		}
		return 0;
	}
	
}
