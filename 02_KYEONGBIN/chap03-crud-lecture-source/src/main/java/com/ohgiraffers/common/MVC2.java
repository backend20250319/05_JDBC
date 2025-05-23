package com.ohgiraffers.common;

public class MVC2 {

    /*
     * ====================== 📦 MVC2 + Spring 계층 구조 역할 정리 ======================
     *
     * ✅ 1. Controller 계층 (@Controller or @RestController)
     * ------------------------------------------------------------------------------
     * - 사용자의 요청(Request)을 받음
     * - 요청에 따라 어떤 비즈니스 로직(Service)을 호출할지 결정
     * - 응답을 View(JSP, Thymeleaf 등) 또는 JSON 형태로 반환
     * - 요청과 응답 흐름을 제어하는 핵심 지점
     *
     * 예: LoginController, ProductController
     *
     * ------------------------------------------------------------------------------
     *
     * ✅ 2. Service 계층 (@Service)
     * ------------------------------------------------------------------------------
     * - 실제 비즈니스 로직 처리 담당
     * - 여러 Repository를 조합해서 로직을 구성
     * - 트랜잭션 처리 책임 (commit / rollback)
     * - 예외 처리 및 유효성 검사도 이 계층에서 처리 가능
     *
     * ❗Controller는 Service에만 의존하고, 직접 DB 처리 안 함
     *
     * 예: UserService, OrderService
     *
     * ------------------------------------------------------------------------------
     *
     * ✅ 3. Repository 계층 (@Repository)
     * ------------------------------------------------------------------------------
     * - DB에 직접 접근하는 계층
     * - SQL 실행, 쿼리 메서드 정의
     * - Spring Data JPA에서는 인터페이스로 정의하고 자동 구현 가능
     *
     * ❗예전에는 DAO라고 불렸으나, Spring에서는 Repository로 표현함
     *
     * 예: UserRepository, MenuRepository
     *
     * ------------------------------------------------------------------------------
     *
     * ✅ 4. Model (DTO / Entity / VO)
     * ------------------------------------------------------------------------------
     * - 데이터를 담는 객체
     * - DB의 테이블 구조와 1:1 매핑되는 경우가 많음 (Entity)
     * - 계층 간 데이터 전달용으로 사용 (DTO)
     *
     * 예: User, OrderDTO, ProductVO
     *
     * ------------------------------------------------------------------------------
     *
     * ✅ 5. View 계층 (JSP / Thymeleaf / JSON)
     * ------------------------------------------------------------------------------
     * - 화면 출력 담당
     * - Controller에서 넘겨받은 데이터를 기반으로 UI 생성
     * - Spring에서는 templates 폴더(JSP, Thymeleaf 등)에 위치
     *
     * 예: login.jsp, userList.html, Vue/React 화면 등
     *
     * ------------------------------------------------------------------------------
     *
     * 💡 전체 흐름 요약:
     * 요청 → Controller → Service → Repository → DB
     *                              ↓
     *                  (DTO/Entity로 데이터 전달)
     *                  ← 결과 반환 ←
     * 응답 ← View ← Controller
     *
     * ==================================================================================
     */

}
