package com.woori.layoutboard.Util;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class PaginationUtil {
    //페이지처리 메소드(Pagination 사용자마음대로 변경가능)
    public static Map<String, Integer> Pagination(Page<?> page) {
        Map<String, Integer> pageInfo = new HashMap<>();

        //페이지 기본정보, 변수명 사용자 마음대로, put 고정
        int currentPage = page.getNumber()+1;
        int totalPage = page.getTotalPages();
        int blockLimit = 5;

        //필요한 페이지정보를 만들기 (java.Math-수학라이브러리)
        int startPage = Math.max(1, currentPage-blockLimit/2);
        int endPage = Math.min(startPage+blockLimit-1, totalPage);
        int prevPage = Math.max(1, currentPage-1); //currentPage-10
        int nextPage = Math.min(totalPage, currentPage+1); //2->3, currentpae+10 2->12
        int lastPage = totalPage;

        pageInfo.put("startPage", startPage);
        pageInfo.put("endPage", endPage);
        pageInfo.put("prevPage", prevPage);
        pageInfo.put("nextPage", nextPage);
        pageInfo.put("lastPage", lastPage);
        pageInfo.put("currentPage", currentPage);

        return pageInfo;
    }
}
