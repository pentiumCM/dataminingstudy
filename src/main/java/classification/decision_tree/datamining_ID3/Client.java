package classification.decision_tree.datamining_ID3;

/**
 * ID3决策树分类算法测试场景类
 *
 * @author lyq
 */
public class Client {
    public static void main(String[] args) {
        String filePath = "F:\\develop_code\\research\\datamining\\dataminingstudy\\src\\main\\java\\classification\\decision_tree\\datamining_ID3\\input.txt";

        ID3Tool tool = new ID3Tool(filePath);
        tool.startBuildingTree(true);
    }
}