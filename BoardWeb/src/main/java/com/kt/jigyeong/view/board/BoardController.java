package com.kt.jigyeong.view.board;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.kt.jigyeong.board.BoardService;
import com.kt.jigyeong.board.BoardVO;

@Controller
@SessionAttributes("board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	// �˻� ���� ��� ����
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap() {
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("����", "TITLE");
		conditionMap.put("����", "CONTENT");
		return conditionMap;
	}
	
	// �� ���
	@RequestMapping(value="/insertBoard.do")
	public String insertBoard(BoardVO vo) throws IOException{
		
		// ���� ���ε�
		 MultipartFile uploadFile = vo.getUploadFile();
		 if(!uploadFile.isEmpty()) {
			 String fileName = uploadFile.getOriginalFilename();
			 uploadFile.transferTo(new File("C:/DEV/file/"+fileName));
		 }
		
		boardService.insertBoard(vo);
		return "getBoardList.do";
	}
	
	// �� ����
	@RequestMapping("/updateBoard.do")
	public String updateBoard(@ModelAttribute("board") BoardVO vo) {
		// board ��� �̸��� �����Ͱ� �ִ��� �켱 Ȯ��.
		System.out.println("getSeq : "+ vo.getSeq());
		System.out.println("getTitle : "+ vo.getTitle());
		System.out.println("getWriter : "+ vo.getWriter());
		System.out.println("getContent: "+ vo.getContent());
		System.out.println("getRegDate: "+ vo.getRegDate());
		System.out.println("getCnt : "+ vo.getCnt());
		
		
		boardService.updateBoard(vo);
		return "getBoardList.do";
	}
	
	// �� ����
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo) {
		boardService.deleteBoard(vo);
		return "getBoardList.do";
	}
	
	// �� �� ��ȸ
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, Model model) {
		model.addAttribute("board", boardService.getBoard(vo)); // board ��� �𵨿� �ҷ��� ������ ����
		return "getBoard.jsp"; // view �̸� ����
		
//		mav.addObject("board", boardDAO.getBoard(vo));
//		mav.setViewName("getBoard.jsp");
//		return mav;
	}
	
	// �� ��� �˻�
	@RequestMapping("/getBoardList.do")
	public String getBoardList(@RequestParam(value="searchCondition", defaultValue="TITLE", required=false) String condition,
								@RequestParam(value="searchKeyword", defaultValue="", required=false) String keyword,
								BoardVO vo, Model model) {
		System.out.println("getBoardList.do");
		System.out.println("�˻� ���� : "+condition);
		System.out.println("�˻� �ܾ� : "+keyword);
		
		// Null Check
		if(vo.getSearchCondition() == null) vo.setSearchCondition("TITLE");
		if(vo.getSearchKeyword() == null) vo.setSearchKeyword("");
		
		
		// Model ���� ����
		model.addAttribute("boardList", boardService.getBoardList(vo));
		return "getBoardList.jsp";
		
//		mav.addObject("boardList", boardDAO.getBoardList(vo));
//		mav.setViewName("getBoardList.jsp");
//		return mav;
	}
}
