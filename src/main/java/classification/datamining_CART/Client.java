package classification.datamining_CART;

public class Client {
	public static void main(String[] args){
		String filePath = "F:\\develop_code\\research\\datamining\\dataminingstudy\\src\\main\\java\\classification\\datamining_CART\\input.txt";
		
		CARTTool tool = new CARTTool(filePath);
		
		tool.startBuildingTree();
	}
}
