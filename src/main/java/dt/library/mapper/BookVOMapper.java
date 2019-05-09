package dt.library.mapper;

import java.util.List;

import dt.library.vo.BookVO;

public interface BookVOMapper {
	/**
	 * 查询书本列表，根据借阅次数排序
	 * @return
	 */
	List<BookVO> findAll();
}
